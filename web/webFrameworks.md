# Web Frameworks to learn
## Static Site Generators
- [Eleventy](https://www.11ty.dev/)
- 

## Components
 - [shadcn](https://ui.shadcn.com/)
## CSS
- [Tailwind](https://tailwindcss.com/)
 - [Tailwind starter kit](https://www.creative-tim.com/learning-lab/tailwind-starter-kit/documentation/download)
Has starters for html, Angular, React and VueJS. 

- 

## [React](https://react.dev/)
### Generate a starter app
Relies on node and npm,

From parent directory:
```bash
npx create-react-app {app-name}
```

From project directory:

If you want to run on github codespaces:
```bash
npm install gh-pages --save-dev
```
More info about running react on codespaces [here](https://github.com/gitname/react-gh-pages)


```bash
npm install
npm run build
```

The build will probably spit out instructions for installing static server
```bash
npm install -g serve
serve -s build
```

That should start a web server, serving you static content previously generated.
Click the "Learn React" link, and you're off and running.

or, as recommended by React html template, just run:
```bash
npm start
```

