# TODO: remove multistage build => Nginx receive dist statics from pipeline build
FROM node:23 AS builder

WORKDIR /app
COPY ./ .

RUN npm install
RUN npm run build -- --configuration production

# Etape 2 : Servir avec Nginx
FROM nginx:alpine
COPY --from=builder /app/dist/front-app/browser /usr/share/nginx/html

EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]
