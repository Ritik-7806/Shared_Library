def call(String img_repo, String img_tag ){
sh """
docker build -t ${img_repo}:${img_tag} .
"""
}
