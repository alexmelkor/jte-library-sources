void call(){
    stage('Build Example') {
            node('jnlp-agent'){
            sh "echo 'Hello world'"
        }
    }
}
