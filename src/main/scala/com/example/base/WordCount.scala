package com.example.base

import org.apache.spark.{SparkConf, SparkContext}
import org.slf4j.LoggerFactory

object WordCount {

    val logger = LoggerFactory.getLogger(this.getClass)
    def main(args: Array[String]): Unit = {
        // 建立连接
        val config = new SparkConf().setMaster("local").setAppName("WordCount")
        val context = new SparkContext(config)

        val lines = context.textFile("data/word-count.txt")
        val words = lines.flatMap(_.split(' '))

        logger.info("data [{}]", words.groupBy(word => word).map {
            case (word, list) => {
                (word, list.size)
            }
        }.collect())

        // 关闭连接
        context.stop()
    }
}