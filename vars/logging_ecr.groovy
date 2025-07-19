def call(String awsAccountId, String region) {
    if (!awsAccountId || !region) {
        error "Both AWS Account ID and region are required."
    }
    sh """
        aws ecr get-login-password --region ${region} | \\
        docker login --username AWS --password-stdin ${awsAccountId}.dkr.ecr.${region}.amazonaws.com
    """
}
