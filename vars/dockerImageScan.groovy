def call(String aws_account_id, String region, String ecr_repoName) {
    sh """
     aws ecr get-login-password --region ${region} | docker login --username AWS --password-stdin ${aws_account_id}.dkr.ecr.${region}.amazonaws.com
     docker run  -v /var/run/docker.sock:/var/run/docker.sock aquasec/trivy image --timeout 30m ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repoName}:latest > scan.txt
     cat scan.txt
    """
}
