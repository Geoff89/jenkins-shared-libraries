def call(String aws_account_id, String region, String ecr_repoName) {
    sh """
     docker build -t ${ecr_repoName} .
     docker tag ${ecr_repoName}:latest ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repoName}:latest
    """
}

 

// aws ecr get-login-password --region us-east-1 | docker login --username AWS --password-stdin 622339756908.dkr.ecr.us-east-1.amazonaws.com
// docker build -t sagini .
// docker tag sagini:latest 622339756908.dkr.ecr.us-east-1.amazonaws.com/sagini:latest
// docker push 622339756908.dkr.ecr.us-east-1.amazonaws.com/sagini:latest