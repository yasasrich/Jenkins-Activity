pipeline {
    agent any

    environment {
        JAVA_HOME = '/usr/lib/jvm/java'
        PATH = '/usr/local/bin:$PATH'
    }

    stages {
        stage('Build') {
            steps {
                sh 'mvn build'
            }
        }
        stage('Test') {
            steps {
                wrap([$class: 'Xvfb', debug: true, displayName: 99, displayNameOffset: 0]){
                    sh 'mvn test'
                }
            }
        }
        stage('Publish') {
            steps {
                step([[$class: 'Publisher', escapeExceptionMsg: true, escapeTestDescp: true, failureOnFailedTestConfig: false, reportFilenamePattern: '**/testng-results.xml', showFailedBuilds: false, thresholdMode: 2, unstableSkips: 100, failedSkips: 100, unstableFails: 0, failedFails: 100]])
            }
        }
    }
}
