pipeline {
    agent { 'master'}
    stages {
        stage('Build') {
            steps {
                echo 'This is build.'
            }
        }
        stage ('Test') {
            steps {
                echo 'This is Test'
            }
        }
    }
}