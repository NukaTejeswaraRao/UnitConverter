pipeline {
    agent any
    tools {
	maven "maven"
    }
    environment { 
        input = 'yes'
    }
    parameters {
        string(name: 'Greeting', defaultValue: 'Hello', description: 'How should I greet the world?')
    }
	
    stages {
        stage('Build') {
            steps {
                echo "${params.Greeting} World!"
                echo 'Building..'
                echo "$input"
		checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/NukaTejeswaraRao/UnitConverter.git']]])
		sh "mvn -Dmaven.test.failure.ignore=true clean package"
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
