FROM node:latest

WORKDIR /app

COPY . .

RUN rm -rf node_modules

RUN npm install

RUN npm i -g @nestjs/cli

RUN nest build

CMD ["npm", "run", "start:prod" ]

EXPOSE 3000