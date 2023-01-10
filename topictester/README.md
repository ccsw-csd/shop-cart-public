# Shop Order Topic Tester

## Invocación

Se debe realizar una llamada POST a la cual se le debe indicar a que topic se desea enviar el mensaje como variable de path:

* URL: http://localhost:8087/topic/{topic}/send

Como Body se adjunta el mensaje:

```json
{
  "groupId":"order-team0-group-id",
  "success":true,
  "data":{
    "uuid":"abe3e894-b732-4475-8156-f582a95e5e48",
    "customer":"customer1",
    "email":"email@email.com",
    "address":"address1",
    "credit":"12345",
    "product":"product1",
    "quantity":2,
    "price":22.4,
    "paid":44.8,
    "shipment":"2023-01-09T14:48:45.338229700",
    "invoice":"abe3e894-b732-4475-8156-f582a95e5e48-customer1-product1"
  }
}
```