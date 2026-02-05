# 🧱 CLUSTER & CONTEXT 
```
kubectl version
kubectl cluster-info
kubectl config current-context
kubectl get nodes
```

# 📦 APPLY / DELETE RESOURCES

```
kubectl apply -f deployment.yaml
kubectl apply -f service.yaml

kubectl delete -f deployment.yaml
kubectl delete -f service.yaml
```

Delete by name:
```kubectl delete deployment spring-app
kubectl delete service spring-service
```

# 🚀 DEPLOYMENT (APP LEVEL)
```
kubectl get deployments

kubectl get deployment spring-app

kubectl describe deployment spring-app
```

Scale instances:
```
kubectl scale deployment spring-app --replicas=2
kubectl scale deployment spring-app --replicas=5
```

# 🧩 PODS (RUNNING INSTANCES)
```
kubectl get pods
kubectl get pods -o wide
```

Describe pod (events, errors):
```
kubectl describe pod <pod-name>
```
Delete pod (K8s recreates it):

```
kubectl delete pod <pod-name>
```

# 📜 LOGS (MOST IMPORTANT)
Single pod:
```
kubectl logs <pod-name>
```
Live logs:
```
kubectl logs -f <pod-name>
```
All pods (using label):
```
kubectl logs -l app=spring-app
kubectl logs -l app=spring-app -f
```
Previous crash logs:
```
kubectl logs <pod-name> --previous
```

# 🌐 SERVICE & NETWORKING
```
kubectl get services
kubectl get svc spring-service
kubectl describe svc spring-service
```
Port forward (quick test):
```
kubectl port-forward service/spring-service 8080:8080
```

# 🧪 DEBUG INSIDE CONTAINER
Shell inside pod:
```
kubectl exec -it <pod-name> -- sh
```
# 🖼️ IMAGES & ERRORS

Image pull issues:
```
kubectl describe pod <pod-name>
```
If using local Docker (Docker Desktop):
```
imagePullPolicy: IfNotPresent
```
Restart rollout

```
kubectl rollout restart deployment spring-app
```
# 📊 STATUS & HEALTH
```
kubectl get events
kubectl get events --sort-by=.metadata.creationTimestamp
```
# 🧹 CLEANUP EVERYTHING
```
kubectl delete deployment spring-app
kubectl delete service spring-service
kubectl delete pod --all
```

# DAILY WORKFLOW (REAL LIFE)
```
docker build -t spring-k8s-demo .
kubectl apply -f deployment.yaml
kubectl apply -f service.yaml
kubectl get pods
kubectl logs -f <pod-name>
```
