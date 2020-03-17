DOCKER_REPOSITORY=$1
DOCKER_IMAGE_NAME=$2
DOCKER_CONTAINER_NAME=$3
SPRING_PROFILE=$4

docker pull ${DOCKER_REPOSITORY}/${DOCKER_IMAGE_NAME}
docker rm -f ${DOCKER_CONTAINER_NAME}
docker system prune --force

docker run -d \
--name ${DOCKER_CONTAINER_NAME} \
--restart=always \
-p8080:8080 \
${DOCKER_REPOSITORY}/${DOCKER_IMAGE_NAME} \
--spring.profiles.active=$4
