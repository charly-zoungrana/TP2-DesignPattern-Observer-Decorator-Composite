# TP2 — Design Patterns : Observer, Decorator, Composite

Implémentation en Java de trois design patterns du catalogue GoF, réalisée dans le cadre du module Design Patterns
(ENSET Mohammedia, cycle ingénieur GLSID).

Chaque pattern est développé sur **sa propre branche**, avec un README dédié qui présente le pattern, son diagramme de
classes et une trace d'exécution. La branche `main` regroupe le code une fois chaque pattern terminé.

## Sommaire

| Pattern | Catégorie | Documentation |
|---|---|---|
| Observer | Comportemental | [README Observer](https://github.com/charly-zoungrana/TP2-DesignPattern-Observer-Decorator-Composite/blob/observer/README.md) |
| Decorator | Structurel | [README Decorator](https://github.com/charly-zoungrana/TP2-DesignPattern-Observer-Decorator-Composite/blob/decorator/README.md) |
| Composite | Structurel | [README Composite](https://github.com/charly-zoungrana/TP2-DesignPattern-Observer-Decorator-Composite/blob/composite/README.md) |

## Observer

**Problème :** plusieurs objets doivent réagir au changement d'état d'un autre objet, sans que celui-ci dépende de leurs
classes concrètes.

**Solution :** le sujet (*observable*) maintient une liste d'observateurs, connus uniquement à travers une interface
commune, et les notifie à chaque changement d'état. Les observateurs peuvent s'abonner ou se désabonner à l'exécution.

Deux variantes ont été implémentées :

- **Push** : le sujet transmet directement le nouvel état, `update(int newState)`.
- **Pull** : le sujet transmet une référence vers lui-même, `update(Observable o)`, et l'observateur récupère les données
  dont il a besoin.

Détails, diagramme de classes et trace d'exécution : [README de la branche `observer`](https://github.com/charly-zoungrana/TP2-DesignPattern-Observer-Decorator-Composite/blob/observer/README.md).

## Decorator

**Problème :** ajouter des responsabilités à un objet de façon dynamique, sans multiplier les sous-classes pour chaque
combinaison de fonctionnalités (éviter l'explosion combinatoire $N \times 2^M$).

**Solution :** un décorateur abstrait (`AbstractDecorator`) hérite du composant de base (`Boisson`) pour la conformité de type et
agrège une instance de `Boisson` pour lui déléguer les appels en y ajoutant son comportement propre (coût et description).
Cette double relation permet d'empiler récursivement des décorateurs (décorer un décorateur).

Composants et décorateurs implémentés :

- **Boissons de base** : `Expresso`, `Deca`, `Sumatra`.
- **Décorateurs concrets** : `ChocolatDecorator` (+1.2), `CaramelDecorator` (+0.8).

Détails, diagramme de classes et trace d'exécution : [README de la branche `decorator`](https://github.com/charly-zoungrana/TP2-DesignPattern-Observer-Decorator-Composite/blob/decorator/README.md).

## Composite

**Problème :** manipuler de façon uniforme des objets simples (fichiers) et des groupes d'objets (dossiers) organisés en structure arborescente (hiérarchies partie-tout), sans multiplier les tests de type (`instanceof`).

**Solution :** une classe abstraite commune (`Component`) définit les opérations et attributs partagés (`name`, `level`, `print()`). Les feuilles (`File`) et les conteneurs (`Folder`) en héritent. Le composite maintient une liste polymorphique d'enfants `List<Component>` et propage récursivement l'opération `print()`. Le code client traite indifféremment un fichier seul ou un dossier complexe.

Composants et éléments implémentés :

- **Composant abstrait** : `Component` (gestion du nom, du niveau `level` et de l'indentation `tabs()`).
- **Feuille (Leaf)** : `File` (représente un fichier primitif sans sous-éléments).
- **Composite** : `Folder` (représente un dossier conteneur avec `addChild(Component)` et délégation récursive).

Détails, diagramme de classes et trace d'exécution : [README de la branche `composite`](https://github.com/charly-zoungrana/TP2-DesignPattern-Observer-Decorator-Composite/blob/composite/README.md).

## Structure du projet

```
src/main/java/net/zoungrana
├── observer       pattern Observer
├── decorator      pattern Decorator
└── composite      pattern Composite
```

## Exécution

Prérequis : JDK 21 et Maven.

```bash
mvn compile

# Exécuter le test du pattern Observer
java -cp target/classes net.zoungrana.observer.Main

# Exécuter le test du pattern Decorator
java -cp target/classes net.zoungrana.decorator.Main

# Exécuter le test du pattern Composite
java -cp target/classes net.zoungrana.composite.Main
```

## Auteur

Charly ZOUNGRANA — Élève ingénieur en Génie Logiciel et Systèmes Informatiques Distribués, ENSET Mohammedia.
