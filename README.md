CentYun Platform
---

盛桃云平台

## 接口返回码

全局返回码说明如下：

* -1      系统繁忙, 请开发者稍候再试
*  0       请求成功

## 各模块端口规则
1. 端口在application.properties或profile中的server.port指定
2. 端口总共4位, 都以8开头
3. 第2、3位表示模块, 其中20以内的为基础模块, 如00是services, 01是user, 02是console, 03是mail, 04是sms ...; 20以上的为具体的应用模块, 如20是cms, 21是account
4. 第4位是同一个模块的不同副本, 多个副本构成应用的集群
5. 各应用的端口如下

```
    services  8001, 8002, 8003 ...
    user      8011, 8012, 8013 ...
    console   8021, 8022, 8023 ...
    mail      8031, 8032, 8033 ...
    sms       8041, 8042, 8043 ...
    tracer    8051, 8052, 8053 ...
    .....
    cms       8201, 8202, 8203 ...
    account   8211, 8212, 8213 ...
    crm       8221, 8222, 8223 ...
```
