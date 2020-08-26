pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                wrap([$class: 'Xvfb']){
                    sh 'ls -a'
                }
            }
        }
    }
}
