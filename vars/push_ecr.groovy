def call(String img_repo, String img_tag, String aws_id, String aws_region){

    sh """
           docker tag ${img_repo}:${img_tag} ${aws_id}.dkr.ecr.${aws_region}.amazonaws.com/${img_repo}:${img_tag}
           docker push ${aws_id}.dkr.ecr.${aws_region}.amazonaws.com/${img_repo}:${img_tag}
    """
                }
