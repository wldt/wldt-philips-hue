# Philips Hue Digital Twin Example - WhiteLabel Digital Twin Framework - Core Library

This project shows how to implement a Digital Twin for Philips Hue Light Bulbs trough the WLDT Framework.

## NodeJs Cli Interaction Examples

CoAP Cli (NodeJS) - https://www.npmjs.com/package/coap-cli

### Well Known Core

Resource discovery to see the list of all available and mirrored Philips Hue Light Bulbs

```shell script
coap get coap://127.0.0.1:5683/.well-known/core
```

Response example:

```
(2.05)  
</5>;if="core.a";rt="Extended color light";title="Hue color lamp 1",</.well-known/core>
```

### GET Light Bulb Status 

Retrieve the status of the target light bulb (with Id: 5).
Response is formatted in JSON + SENML.

```shell script
coap get coap://127.0.0.1:5683/5
```

Response example:

```
(2.05)  
{ 
    "updateTime":1596274772381,
    "baseName":"Philips-LCT015-1-A19ECLv5:00:17:88:01:04:0c:e5:26-0b",
    "booleanValue":true
}
```

### Switch ON/OFF 

Change the light state with a single POST request with an empty body.

```shell script
echo -n '' | coap post coap://127.0.0.1:5683/5
```

The response is just a feedback about the positive or negative result of the change. 
A GET request can be done to retrieve the updated value of device.
Response example:

```
(2.04)  
```

