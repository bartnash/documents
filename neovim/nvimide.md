# nvim as IDE, installation and setup

On Ubuntu:
```bash
sudo apt install neovim
```

## Install vim-plug plugin manager
curl -fLo ~/.local/share/nvim/site/autoload/plug.vim --create-dirs https://raw.githubusercontent.com/junegunn/vim-plug/master/plug.vim

### Configure neovim to use vim-plug
Edit ~/.config/nvim/init.vm, adding the following:
```bash
call plug#begin()

" List plugin names here

call plug#end()
```

Restart or run nvim and run
- :PlugInstall

Alternatively, copy or paste contents of the init.vim from this directory to ~/.config/nvim/init.vim.
It contains plugin comands for the following:

### markdown-preview
https://github.com/iamcco/markdown-preview.nvim

- :MarkDownPreview - starts synchronized preview in browser.

###


