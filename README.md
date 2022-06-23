# Образовательный Проект

## Создание пользователя PostgreSQL
Пользователь создавался в консоли системы Manjaro Linux.

Login as a postgres user with the help of command provided below:
```css
$ sudo -u postgres -i
```

After logging into postgres, you have to create a PostgreSQL cluster by issuing the below-stated command:
```css
$ initdb --locale $LANG -E UTF8 -D '/var/lib/postgres/data/'
```

Enable the postgres service:
```css
$ sudo systemctl enable postgresql
```

After enabling, check the status of the service to verify its running or not:
```css
$ sudo systemctl status postgresql
```

Accessing the postgres shell:
```css
$ psql -U postgres
```

Set a password:
```css
\password
```

Then quit:
```css
\q
```

Activate the environment:
```css
$ source pgadmin4/bin/activate
```

Navigate to the pgAdmin4 and start the pgAdmin4:
```css
$ cd pgadmin4
```

```css
$ pgadmin4
```
