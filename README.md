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
| Composite | Structurel | — |

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

**Problème :** manipuler de façon uniforme des objets simples et des groupes d'objets organisés en arborescence.

**Solution :** feuilles et composites implémentent une même interface ; un composite contient des enfants de ce type et
leur propage les opérations. Le code client traite un élément seul et un groupe de la même manière.

Documentation à venir sur la branche `composite`.

## Structure du projet

```
src/main/java/net/zoungrana
├── observer       pattern Observer
└── decorator      pattern Decorator
```

Le package `composite` sera ajouté au fur et à mesure.

## Exécution

Prérequis : JDK 21 et Maven.

```bash
mvn compile

# Exécuter le test du pattern Observer
java -cp target/classes net.zoungrana.observer.Main

# Exécuter le test du pattern Decorator
java -cp target/classes net.zoungrana.decorator.Main
```

## Auteur

Charly ZOUNGRANA — Élève ingénieur en Génie Logiciel et Systèmes Informatiques Distribués, ENSET Mohammedia.
