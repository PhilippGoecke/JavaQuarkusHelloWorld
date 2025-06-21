podman build --no-cache --rm -f Containerfile.maven -t quarkus:demo .
podman run --interactive --tty -p 8888:8888 quarkus:demo
echo "browse http://localhost:8888/hello/ or http://localhost:8888/hello/greeting/World"
