
# CI / CD Template Project
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
![Front Pipeline](https://github.com/ymougenel/prod-ready-template/actions/workflows/front_workflow.yml/badge.svg)
![Back Pipeline](https://github.com/ymougenel/prod-ready-template/actions/workflows/backend_workflow.yml/badge.svg)
[![Netlify Status](https://api.netlify.com/api/v1/badges/5a97cbd9-28d4-46e8-841c-6acffc83a287/deploy-status)](https://app.netlify.com/projects/template-front/deploys)


This repository is a **template project** designed to showcase a complete CI/CD pipeline — from **testing and code quality checks** all the way to **deployment in production**.

---

## 🌟 Voxxed Days Luxembourg 2025

This project serves as a demonstration for the **Voxxed Days Luxembourg 2025** conference, illustrating how modern CI and CD practices can be applied to a real-world application.

🎤 [View the slides from the talk](https://docs.google.com/presentation/d/e/2PACX-1vRAf05PFN4hYtN_ZY1uHfM3osnrK9nmvrVYSV05nyGvVxWCQMqBGKMUlO_OYiYC8LmnGVRu1Pp6y_Ij/pub?start=false&loop=false&delayms=3000#slide=id.g245bbab786a_0_604)

---

## 🛠 CI — Continuous Integration

The CI pipeline covers:

- **Unit Tests:** Validate functionality at a granular level.
- **End-to-End Tests:** Ensure your application works from the user's perspective.
- **Linter:** Enforce coding standards and best practices.
- **Quality Check:** Perform static code analysis to identify bugs and vulnerabilities.
- **Security:** Scan for vulnerability issues in code and components.

---

## 🚀 CD — Continuous Delivery

The CD pipeline focuses on:

- **Docker Image Build:** Containerize your application for delivery.
- **Publish:** Push the Docker image to a container registry.

---

## 🌍 Deployment

This template includes **deployment strategies** to put your application into production:

### 1. Managed Services Deployment
Includes example configurations for deploying to cloud-based managed services such as Netlify and Koyeb.

### 2. Self-managed Server Deployment with Ansible

You can deploy the application on your own infrastructure using Ansible:
* [Server Configuration example](https://github.com/Kavu-Dechet/Kavu-Server).
* An automated delivery through the combination of Ansible and GitHub Actions. 

---

## 🤝 Collaborative & Open Source

This project is **open to contributors** and licensed under **MIT**.  
We appreciate your **feedback, suggestions, and contributions** — feel free to **open issues or pull requests**!

---

🚀 Happy delivery and see you at Voxxed Days Luxembourg 2025!  