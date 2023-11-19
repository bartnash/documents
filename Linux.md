## Package Manager
### Ubuntu - apt
 - sudo apt update
### Fedora
 - sudo dnf ???
 
 [Quick Reference](https://docs.fedoraproject.org/en-US/quick-docs/dnf-package-manager-quick-reference/)


## Mounting Google Drive
I'm using [google-drive-ocamlfuse](https://github.com/astrada/google-drive-ocamlfuse)

It looks like it won't automount after reboot.

Just run
```bash
google-drive-ocamlfuse ~/drivename

```
or

```bash
google-drive-ocamlfuse -label other ~/otherdrive
```


