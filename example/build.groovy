void call(){
    stage('Build Example') {
        node(config.agent) {
            sh "echo 'Hello world from ${config.agent}'"
            sh "env | sort"
        }
    }
}
