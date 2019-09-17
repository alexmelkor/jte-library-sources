void call(){
    stage('build') {
        node('jnlp-agent') {
            sh "echo 'Hello world'"
        }
    }
}
