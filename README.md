# how to invoke

```bash
curl -X GET https://sp1v9s4rb6.execute-api.us-east-1.amazonaws.com/dev/installations -H "Content-Type: application/json" -H 'Authorization: TODO' 
```

# Business requirements

* create installation
  * name
  * template
  * created date
  * status
  * updated date
  * created by
  * updated by

* list installation sorted by name with non-terminal status
* search installation list by name

* view installation details
  * installation item
    * name
    * status (new / waiting / done)
    * comment
    * add file

* installation template
  * name
  * installation item
    * name 

# Tech todo

https://docs.aws.amazon.com/lambda/latest/dg/foundation-iac.html

* add custom lambda authorizer
* add tests
* use http api (not api) which is cheaper apparently
* setup and connect to DB

# Later
* setup authorizer
  * https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-use-lambda-authorizer.html
  * aws cognito - played manually
    * create user pool
    * add user
    * add authorizer to api gateway
    * assign authorizer to resources method
    * deploy api manually


# AWS infra

* create IAM user
* policy: lambda full, cloudformation full
* add policy to put object in S3 bucket
```json
{
    "Version": "2012-10-17",
    "Statement": [
        {
            "Sid": "VisualEditor0",
            "Effect": "Allow",
            "Action": [
                "s3:PutObject",
                "s3:GetObject",
                "s3:ListBucket"
            ],
            "Resource": [
                "arn:aws:s3:::installation-flow-api-bucket-dev/*",
                "arn:aws:s3:::installation-flow-api-bucket-dev"
            ]
        }
    ]
}
```
```json
{
    "Version": "2012-10-17",
    "Statement": [
        {
            "Sid": "VisualEditor0",
            "Effect": "Allow",
            "Action": [
                "iam:CreateRole",
                "iam:TagRole"
            ],
            "Resource": "arn:aws:iam::051826737436:role/*"
        }
    ]
}
```
* create S3 bucket
* follow guide: https://micronaut-projects.github.io/micronaut-aws/4.8.0/guide/#amazonApiGateway
* best to create app using micronaout launcher
