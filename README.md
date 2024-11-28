# Spring Boot - Practice

> springboot基础入门已经相关技术整合文档

[![License](https://img.shields.io/badge/license-MIT-blue.svg)](https://opensource.org/licenses/MIT)

## 目录结构

- [简介](#简介)
- [安装与使用](#安装与使用)
- [配置](#配置)
- [开发指南](#开发指南)
---

## 简介

项目主要是针对入门开发人员快速上手springboot开发，以及相关代码整合相关服务的参考示例。


## 安装与使用

### 前提条件

开发工具：idea
操作系统：windows/linux/ios
JDK：1.8
Maven

### 安装步骤

1. 克隆本仓库：
    ```bash
    git clone https://github.com/Guns-Roses/spring-boot-practice.git
    cd spring-boot-practice
    ```

2. 安装依赖项：
    - **对于 Java 项目**：
        ```bash
        mvn clean install
        ```

3. 配置文件：
    - Module的resources
      文件下的application.properties

4. 运行项目：
    - **对于 springboot-practice 项目**：
        ```bash
        java -jar Application.java
        ```

---

## 配置

每个Module都是相互独立的,每个Module的resources
文件下的application.properties文件为其配置文件

```yaml
# application.properties
server:
  host: localhost
  port: 8080
    
