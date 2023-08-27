Simple web application for OTUS homework 1

Runs on port 8000

Available APIs:
- GET /greeting
  - parameter 'name' - string, optional
- GET /health


---

Build application

```
./gradlew clean build
```

Run application

```
# command
java -jar ./build/libs/$JAR_FILE_NAME.jar

# example
java -jar ./build/libs/otus-homework-1-0.0.1-SNAPSHOT.jar
```

---

Build docker image

```
docker build --platform linux/amd64 -t otus-hw-1 ./
```

Run docker image 

```
docker run \
    --name otus-hw-1 \
    -d \
    -p 8080:8000 \
    otus-hw-1
```

---

Start minikube

```
minikube start
```

Setup nginx ingress controller, installed via helm (not minikube default) 

```
kubectl create namespace m \
    && helm repo add ingress-nginx https://kubernetes.github.io/ingress-nginx/ \
    && helm repo update \
    && helm install nginx ingress-nginx/ingress-nginx --namespace m -f ./setup/nginx-ingress.yaml
```

Apply all k8s configurations

```
kubectl apply -f ./k8s/
```

Setup minikube tunnel

```
minikube tunnel
```

Configure hosts in /etc/hosts:
```
127.0.0.1 arch.homework
```

URLs for testing:
- GET http://arch.homework/health
- GET http://arch.homework/otusapp/afli/health
- GET http://arch.homework/otusapp/afli/greeting
