def call(String cred_id) {
    withCredentials([file(credentialsId: cred_id, variable: 'SECRET_ENV_FILE')]) {
        sh 'cp $SECRET_ENV_FILE .env'
    }
}
