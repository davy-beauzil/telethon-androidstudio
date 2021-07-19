## Contexte : 
L’application Telethon a pour but de coordonner et dynamiser les actions du Telethon du département.
Trois objectifs ont été fixés : 
- [x] proposer les activités proposées dans le département
- [x] permettre aux utilisateurs d’avoir accès en temps réel aux activités
- [ ] réaliser un système de QCM, qui permettrait d’ajouter des questions/réponses et permettre aux utilisateurs connectés d’y répondre et d’être classés.

## Commencement du projet :
Au départ, nous avons réalisé un projet chacun de notre côté et nous développions chacun un module différent. Au moment de mettre en commun, nous avons rencontré des problèmes de compatibilité. Nous avons alors réglé ces problèmes et sommes retournés sur une même base de travail.
Ce projet a été réalisé en Java sur Android Studio avec une base de données interne réalisée avec Room, et un serveur distant développé en PHP et avec une base de données distante créée avec MySQL.

## Travail réalisé personnellement :
J’ai dans un premier temps créé la base de données interne avec Room d’une part, puis la base de données distante avec MySQL d’une autre part.

Une fois les bases de données finalisées, j’ai commencé à développer le système d’inscription. J’ai tout d’abord développé la partie graphique afin d’intégrer diverses informations dans le formulaire (nom, prénom, date de naissance, mail, mot de passe, …).
Cette partie d’inscription doit envoyer les données sur le serveur distant afin qu’il enregistre les informations en base de données et renvoyé une réponse afin de confirmer l’enregistrement. J’ai été bloqué durant 2 séances par cette réponse. Effectivement, je recevais une réponse que n’arrivait pas à interpréter Java. Ce blocage m’a fait prendre déjà pas mal de retard à ce moment-là.

Une fois l’inscription fonctionnelle, j’ai procédé au même développement, mais pour la partie connexion. Le processus est quasiment identique. J’envoie une adresse mail et un mot de passe au serveur et ce dernier cherche en base de données l’utilisateur correspondant, et renvoie une réponse, positive ou négative. Dans le cas où elle est positive, l’utilisateur se retrouve donc sur la page d’accueil et dans le cas où la réponse est négative, il est informé par un message d’erreur.

Une fois cette partie inscription / connexion terminée, j’ai fait en sorte que lorsque l’utilisateur est connecté et clique sur un bouton du menu, il soit dirigé vers les pages correspondantes et que les données dont les pages ont besoin soient aussi transmises (nom, prénom, …).
J’ai aussi fait en sorte que l’utilisateur puisse se déconnecter de son compte, il est alors redirigé vers la page de connexion.

## Procédures mises en place :
À chaque fin de séance, nous mettions en commun le travail que nous avions réalisé sur le serveur GIT afin que pour la séance prochaine, nous reprenions le travail sur une base propre et commune.

## Remarques : 
Le fait d’avoir été en semi-distanciel d’une part, d’avoir une personne de notre groupe qui n’a pas pu continuer à développer à nos côtés et en plus d’avoir accumulé du retard en bloquant sur certaines parties de notre travail a rendu compliquée la tenue des délais.
