Spark运行所需Hadoop依赖

1. [下载地址](https://github.com/srccodes/hadoop-common-2.2.0-bin)

2. 配置环境变量
```shell
vi /etc/profile

export HADOOP_HOME=/hadoop-common-2.2.0-bin
export PATH=$HADOOP_HOME/bin:$PATH

source /etc/profile
```

3. 重启IntelliJ IDEA