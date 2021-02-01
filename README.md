# ssLoginHandler
 Creating a login form using java servlets and MySQL DB.

## MySQL Database Schema

To test login validation, please create schema and table with the following init queries.

* Schema Name: `sslogin`
* Table Name: `registry`
* Init Query: 
```
`id` INT AUTO_INCREMENT NOT NULL,
	`user` VARCHAR(255) NOT NULL,
	`pass` VARCHAR(255) NOT NULL,

	PRIMARY KEY (`id`)
```
 
