pipeline {
    agent any
//     tools {
//         maven 'Maven 3.8.1'
//         jdk 'JDK 1.8'
//     }
//     stages {
//         stage('Build') {
//             steps {
//                 sh 'mvn -B -DskipTests clean package'
//             }
//         }
//     }
    stages {
        stage("Start") {
            steps {
                sh "echo Start > /tmp/Start.txt"
            }
        }
        stage("End") {
            steps {
                sh "echo End > /tmp/End.txt"
            }
        }
    }
}