#!/bin/sh

# ejecute `mysql -p` dentro del contenedor `tareas-db`
docker exec -it tareas-db \
  mysql -p
# ejecute el script usando bash
bash ./mysql.sh# cambia los permisos
chmod +x mysql.sh

# se puede ejecutar solo con el nombre del archivo
./mysql.sh