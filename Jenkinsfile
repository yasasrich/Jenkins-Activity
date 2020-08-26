pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                wrap([$class: 'Xvfb', debug: 'true', displayName: 99]){
                    sh 'ls -a'
                }
            }
        }
    }
}
