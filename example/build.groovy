void call(){
    stage('Build Example') {
        node(config.agent) {
            sh "echo 'Hello world'"
        }
    }
}
