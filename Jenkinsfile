pipeline {
    agent any
    tools{
        maven '3.8.1'
    }

    stages{
        stage('Build Maven'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/YoucefBenabderrahmane/devops-automation']]])
                bat 'mvn clean install'
            }
        }

        stage('Build docker image'){
            steps{
                script{
                    bat 'docker build -t youcefben/devops-integration .'
                }
            }
        }
         stage('Push image to Hub'){
            steps{
                script{

                   bat 'docker login -u youcefben -p Youcefgl5566'


                   bat 'docker push youcefben/devops-integration'
                }
            }
        }

    }
}