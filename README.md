### SMS Integration Project

**Introduction**

This project is a Java Spring Boot application that provides an API for sending SMS messages using the Twilio service. It includes a controller, service, and DTO (Data Transfer Object) for handling SMS requests.

**Prerequisites**

* Java Development Kit (JDK)
* Maven
* Twilio Account SID and Auth Token

**Configuration**

The Twilio Account SID and Auth Token should be configured in the `application.properties` file:

```properties
twilio.accountSid=AC189431c2c2431913fb537e2c5454ee96
twilio.authToken=a355c0de3bcb7d9a423585780b792aeb
```

**Running the Application**

You can run the application by executing the following command:

```bash
mvn spring-boot:run
```

The application will start on port 8081 as configured in the `application.properties` file.

**Sending an SMS**

To send an SMS, make a POST request to the following endpoint:

```bash
POST /api/sms/send-sms
```

The request body should be in JSON format and include the recipient's phone number and the message body. Here's an example JSON request:

```json
{
  "to": "RECIPIENT_PHONE_NUMBER",
  "body": "This is your SMS message."
}
```

Replace RECIPIENT_PHONE_NUMBER with the actual recipient's phone number and customize the message body as needed.

**Dependencies**

* Spring Boot
* Twilio Java SDK

**License**

This project is licensed under the MIT License.

**Usage**

To use this project, clone it to your local machine and navigate to the project directory. Then, run the following command to install the project's dependencies:

```bash
mvn clean install
```

Once the dependencies have been installed, you can start the application by running the following command:

```bash
mvn spring-boot:run
```

The application will start on port 8081 as configured in the `application.properties` file.

To send an SMS, make a POST request to the following endpoint:

```bash
POST http://localhost:8081/api/sms/send-sms
```

The request body should be in JSON format and include the recipient's phone number and the message body. Here's an example JSON request:

```json
{
  "to": "+15555555555",
  "body": "This is your SMS message."
}
```

If the request is successful, you will receive a JSON response with a status code of 200 and the following body:

```json
{
  "success": true,
  "message": "SMS message sent successfully."
}
```

Otherwise, you will receive a JSON response with a status code of 400 or 500 and an error message.
