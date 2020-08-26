pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                wrap([$class: 'Xvfb', debug: 'true']){
                    sh 'ls -a'
                }
            }
        }
    }
}
