def call(String img_repo ){
 sh """
  docker rm -f ${img_repo} || true 
  docker-compose up -d ${img_repo} || { echo 'docker-compose failed'; exit 1; }
"""
}
