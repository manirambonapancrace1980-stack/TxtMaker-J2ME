# TxtMaker - J2ME Text Editor

TxtMaker est une application de traitement de texte simple pour les appareils J2ME (Java 2 Micro Edition).

## Caractéristiques

- ✏️ Édition de texte simple et intuitive
- 💾 Sauvegarde du texte
- 🗑️ Effacer le texte
- 📱 Compatible avec les appareils J2ME (MIDP 1.0)

## Prérequis

- Java Development Kit (JDK) 1.4 ou supérieur
- Apache Ant pour la compilation
- J2ME Wireless Toolkit (optionnel, pour la simulation)

## Structure du projet

```
TxtMaker-J2ME/
├── src/
│   ├── TxtMaker.java        # MIDlet principal
│   └── MainScreen.java      # Interface utilisateur
├── build.xml                # Script de compilation Ant
├── TxtMaker.jad             # Descripteur d'application J2ME
└── dist/
    └── TxtMaker.jar         # Fichier JAR compilé
```

## Compilation

### Avec Ant
```bash
ant build-jar
```

### Sans J2ME WTK
Si vous n'avez pas le J2ME WTK installé, vous pouvez compiler avec les APIs MIDP :

```bash
javac -cp /path/to/midpapi.jar:/path/to/cldcapi.jar src/*.java -d build/classes
jar cfm dist/TxtMaker.jar MANIFEST.MF -C build/classes .
```

## Déploiement

1. Transférez `TxtMaker.jar` et `TxtMaker.jad` sur votre appareil J2ME
2. Ouvrez le fichier `.jad` pour installer l'application
3. Lancez l'application depuis le menu des applications

## Manifest du JAR

Le fichier JAR inclut les attributs MIDP requis :
- MIDlet-1: Classe principale
- MicroEdition-Configuration: CLDC-1.0
- MicroEdition-Profile: MIDP-1.0

## Fichiers générés

- `dist/TxtMaker.jar` - Application compilée
- `dist/TxtMaker.jad` - Descripteur d'application

## Nettoyage

```bash
ant clean
```

## Licence

MIT License - Voir LICENSE pour plus de détails

## Auteur

TxtMaker Development Team
