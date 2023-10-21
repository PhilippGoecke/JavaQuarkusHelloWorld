docker build --no-cache --rm -f Containerfile.maven -t quarkus:demo .
docker run --interactive --tty -p 8888:8888 quarkus:demo
echo "browse http://localhost:8888/hello?name=Test"
