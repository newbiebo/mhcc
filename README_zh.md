# mhcc
[README](README.md) | [中文文档](README_zh.md)

## 为什么使用mhcc？

在家庭服务器中部署mhcc，mhcc可以帮你：
* 省去购买昂贵的磁盘阵列。
* 可用极少的资源保证家庭数据安全。
* bark应用消息、邮件实时推送服务器状态。
* 服务器状态监控。
* 提供服务器管理页面。
* docker快速部署
* 模块化部署
* 
## 快速开始

### 入门
安装docker请参考[docker官方文档](https://docs.docker.com/get-started/)
docker部署,执行如下命令即可体验：
```
docker run -it -d --restart=always --name mhcc newbiebo/mhcc:0.0.1
```
### 进阶

## 接口文档
[Interface doc](RestApi.http)

## 项目简介

### 代码结构

#### mhcc-api
- grpc对外接口暴漏，支持软硬件连接、通信
- 提供控制功能
#### mhcc-gateway
- 网关，鉴权登录
#### mhcc-message
- 消息中心
#### mhcc-notice
- 通知中心
#### mhcc-task
- 任务服务
#### mhcc-web
- 前端服务
### 接口文档
#### [mhcc-api]()
#### [mhcc-gateway]()
#### [mhcc-message]()
#### [mhcc-notic]()
#### [mhcc-task]()
#### [mhcc-web]()
## 计划
- build001 进行中：构建基本服务框架，实现基本可用，支持