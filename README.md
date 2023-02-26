
# Portal
Portal management using java Spring boot 
## Framework

 - Java Spring Boot 
 - JPA
 - MySQL Database
 - Hibernate
 - lombok


## API Reference

#### Get all items

```http
  GET /getStudent
```

```http
  GET /getLaptop
```
```http
  GET /getBooks
```
```http
  GET /getCourse
```


#### Post User


```http
  POST /addStudent
```
```http
  POST /addLaptop
```
```http
  POST /addBooks
```
```http
  POST /addCourse
```


#### Update

```http
  PUT /updateStudent/{id}/{name}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `int` | **Required**. Id of item to fetch |
|  `name`   | `String` | **Optinal** Name to update|

```http
  PUT /updateLaptop/{id}/{name}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `int` | **Required**. Id of item to fetch |
|  `name`   | `String` | **Optinal** Name to update|

```http
  PUT /updateBook/{id}/{name}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `int` | **Required**. Id of item to fetch |
|  `name`   | `String` | **Optinal** Name to update|

```http
  PUT /updateCourse/{id}/{name}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `int` | **Required**. Id of item to fetch |
|  `name`   | `String` | **Optinal** Name to update|


#### Delete

```http
  DELETE /deleteBook/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `int` | **Required**. Id of item to delete |

```http
  DELETE /deleteStudent/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `int` | **Required**. Id of item to delete |


```http
  DELETE /deleteLaptop/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `int` | **Required**. Id of item to delete |


```http
  DELETE /deleteCourse/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `int` | **Required**. Id of item to delete |



## Authors

- [@Yogesh](https://github.com/Yogesh-VasanthaKumar/)


