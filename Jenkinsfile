//import groovy.json.JsonSlurper
//def list = new JsonSlurper().parseText('[{"Greeting":"welcome to the big data world , Mr.","Name":"Tejeswara"}]')
//echo 'list.Greeting'
//echo 'list.Name'
pipeline {
    agent any
    tools {
	maven "maven"
    }
    parameters {
        string(name: 'Greeting', defaultValue: 'Hello', description: 'How should I greet?')
	string(name: 'Name', defaultValue: 'Nuka Tejeswara', description: 'Whom should I greet?')
    }
	
    stages {
        stage('Build') {
            steps {
		echo "${params.Greeting} ${params.Name}"
                echo 'Building..'
		checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/NukaTejeswaraRao/UnitConverter.git']]])
		bat "mvn clean -Dmaven.test.failure.ignore=true package "
		echo "build completed, now moving the jar file to deploy location"
		bat "deploy.sh"
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                bat "mvn test"
            }
        }
        stage('Deploy') {
            when {
              expression {
                currentBuild.result == null || currentBuild.result == 'SUCCESS' 
              }
            }
            steps {
                echo 'Deploying....'
            }
        }
    }
    post {
		always {
		    emailext body: 'the pipeline has been triggered successfully', subject: 'Pipeline Summary', to: '1tejeswararaonuka@gmail.com'
			echo 'pipeline has ended'
		}
	}
}
