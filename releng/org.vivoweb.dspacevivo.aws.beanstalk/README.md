# DSpace-VIVO Deployment on Amazon Web Service Beanstalk
This package contains the elements necessary to deploy VIVO-DSpace on AWS-Beanstalk

## Deployment stage
### 1) Edit the config file 00-env.sh

In the 00-env.sh file, specify the appropriate values for the attributes related to the AWS deployment

>  export REGION= Area of your AWS space 
export VPC_NAME= Name of the deployment Virtual Private Cloud
export VPC_ID=Virtual Private Cloud Numerical ID
export AWS_SUBNET_PUBLIC_ID_1= First subnet ID
export AWS_SUBNET_PUBLIC_ID_2=Second subnet ID
export AWS_CUSTOM_SECURITY_GROUP_ID= Security group
export CLE_SSH= your ss

### 2) Build VIVO war files
run command `01-build-vivo-war.sh`
### 3) Deploy VIVO-DSpace to AWS-Beanstalk container
run command `02-EB-deploy.sh`
## Other possible configurations
Before launching the compilation, it is possible to modify certain deployment parameters by indicating the appropriate values in the various files contained in:

    org.vivoweb.dspacevivo.aws.beanstalk/aws-platform/.ebextensions
    org.vivoweb.dspacevivo.aws.beanstalk/aws-platform/.platform/hooks

-- EOD--
