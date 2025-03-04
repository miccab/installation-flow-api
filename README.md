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

AWS infra
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