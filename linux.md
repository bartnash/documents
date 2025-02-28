## Package Manager
### Ubuntu - apt
 - sudo apt update
   - Updates package information
 - sudo apt upgrade
   - Installs available upgrades
 - sudo apt install xyz
   - Installs the 'xyz' package
### Fedora
 - sudo dnf 
To see what updates would be applied:
```
dnf list udates
```

After updating, to determine what services should be restarted, or if system needs re-booting:
```
needs-restarting [-r]
```
 
 [Quick Reference](https://docs.fedoraproject.org/en-US/quick-docs/dnf-package-manager-quick-reference/)

## Dual Boot
Dec 2024 - I configured dual boot of Fedora 41 and Windows 11 (pre-installed) 
   on new Dell desktop.  Didn't take notes, but here's what I remember:
 - In Windows, reduce partition of C: to around 180G, leaving around 800G 
    available.  System was configured to use bitlocker, which I did not
    turn off.  Did configure PIN for windows account as part of initial
    setup.
 - Reboot into bios settings.  Disable secure boot.  Was not able to
    configure boot from USB as UEFI boot was enabled.  Added new boot option
    and selected from among boot options on USB drive.  Don't remember which
    one I chose, maybe GRUB?
 - Boot into Linux, play around a bit to make sure system seems functional.  Run 
    the "Install to Drive" tool.  Mostly took defaults for partition setup.
 - Configure Linux as you wish.
 - To access original C: drive, log into Windows account to obtain bitlocker key. 
    This will need to be provided to access drive from Linux or during next boot
    of Windows partition.
 - Go back into BIOS settings and re-enable secure boot.

=======
## Disk Management

lsblk - list block devices.  Lists information about available block devices

## Mounting Google Drive
Just adding the account to managed accounts in Gnome makes files available through Nautilus, which may be good enough.

I have also used [google-drive-ocamlfuse](https://github.com/astrada/google-drive-ocamlfuse).

It looks like it won't automount after reboot.

Just run
```bash
google-drive-ocamlfuse ~/drivename

```
or

```bash
google-drive-ocamlfuse -label other ~/otherdrive
```

## Java alternatives
### /etc/alternatives

Being used for lots of stuff at the system level.

Pick a java version:

```
sudo alternatives --config java

```
 
Add new alternative with:
```
sudo alternative --install --help
```



### sdkman
Still using sdk man for Gradle, Groovy and Java.

```
sdk use java [tab]
```
will show list of installed versions.

```

```
## Java
There is newer option for setting JVM memory flags that works best in containers.   
```
java -XX:+UnlockExperimentalVMOptions -XX:InitialRAMFraction=25 -XX:MinRAMFraction=3 -XX:MaxRAMFraction=2 -XX:+PrintFlagsFinal -version |grep RAM
```
Learn more at:

* https://developers.redhat.com/articles/2022/04/19/java-17-whats-new-openjdks-container-awareness
* https://developers.redhat.com/articles/2022/04/19/java-17-whats-new-openjdks-container-awareness#tuning_defaults_for_containers
* https://www.baeldung.com/java-jvm-parameters-rampercentage
* https://blog.gceasy.io/2020/11/05/difference-between-initialrampercentage-minrampercentage-maxrampercentage/

The xxRAMPercentage options seem preferable, but xxRAMFraction seems to be what was backported to Java 8.

## Maven

How to manually install a plugin:
```
mvn install:install-file -DgroupId="org.eclipse.emt4j" -DartifactId="emt4j-maven-plugin" -Dversion="0.6.0" -Dfile="/home/banash/tech/emt4j/emt4j-maven-plugin-0.6.0.jar" -Dpackaging=jar -DgeneratePom=true

```

## httpie
http command is more gooder'n curl, for most Json stuff.
get is easy,
```
http :8080/fruits
```

POST is easy
```
http :8080/fruits name=orange type=citrus
```





## Python
Python is installed as python2 and python3, as are pip (pip2 and pip3).

## OpenShift Local
Current way to test OpenShift locally is 'OpenShift Local'.  I installed from https://console.redhat.com/openshift/create/local

Supposed to be replacement for CodeReadyContainers.  Ironically, the tar file is named crc-...

Claims to require libvirt, but RHEL/Fedora instructions did not say to install.

crc binary is in ~/Downloads/crc.../

Can safely run 'crc delete', then just copy the binary to ~/bin.
Then run:
```
crc setup
```

Procedure

(Optional) On Linux, the OpenShift Container Platform preset is selected by default. To select the the Podman container runtime preset:
```
crc config set preset podman
```
Set up your host machine for Red Hat OpenShift Local:
```
crc setup
```

The server is accessible via web console at:
  https://console-openshift-console.apps-crc.testing

Log in as administrator:
```
  Username: 
  	kubeadmin
  Password: 
  	Q9kny-es8IY-BRH2s-dtEcn
```

Log in as user:
```
  Username: developer
  Password: developer
```

Use the 'oc' command line interface: 
```
  eval $(crc oc-env)
  oc login -u developer https://api.crc.testing:6443
```
Note that the above eval command will modify path to run a more recent version of 'oc'.

### Installing knative

## K8S Tools

### kubectl
### kubectx
Used to easily switch contexts (clusters) on kubectl
* `kubectl ctx`  lists contexts
* `kubectl ctx contextname`  switches to that context/cluster
* `kubectl ctx <NEW_NAME>=<NAME>`  renames a context

### kubens
Switches between Kubernetes namespaces

### minikube
minikube start

minikube stop

For [Knative course](https://redhat-developer-demos.github.io/knative-tutorial/knative-tutorial/index.html), start with ~/github/knative-tutorial/bin/start-minikube.sh

### Secret Management
[Good article](https://auth0.com/blog/kubernetes-secrets-management/) describing ESO, Sealed Secrets, and CSI

- [Secrets Store CSI Driver](https://secrets-store-csi-driver.sigs.k8s.io/) Mounts secrets from external source as CSI volume in pod.
- [Sealed Secrets](https://github.com/bitnami-labs/sealed-secrets) Uses public key to encrypt secret for storing in source control, private key is used to decrypt within K8s by controller.
- [External Secrets Operator](https://external-secrets.io/) Operator which keeps K8S secrets in sync with external secret sources.


## Podman

Run an image, in iteractive mode, in a container:
```
podman run -it 2f3c7f65a201
```

Run sh/bash in an image:
```
podman run -it --entrypoint sh 2f3c7f65a201

podman run -it 2f3c7f65a201 bash

```

List locally installed images:
```
docker images
```

List running containers:
```
podman ps
```
 
Run command in existing container:
```
podman exec -it aae74c6cd36f bash
```

Clean up disk space used by docker/podman:

```
podman system prune
podman system prune -a
podman volume prune
```

Need to look at k3d, k3s?

### TestContainer support

```

# Install the required podman packages from dnf. If you're not using rpm based
# distro, replace with respective package manager
sudo dnf install podman podman-docker
# Enable the podman socket with Docker REST API
systemctl --user enable podman.socket --now
# Set the required envvars
#  I added these to .bashrc, should not be needed again.
export DOCKER_HOST=unix:///run/user/${UID}/podman/podman.sock
export TESTCONTAINERS_RYUK_DISABLED=true

```
For some reason, it broke.  Here's what I think fixed it for now:
```
sudo chown $USER:$USER /run/podman/podman.sock
sudo chown $USER:$USER /run/podman/
```

# TLS Certificates
### File formats

* PEM - base 64 encoded.  May contain cert, ca and key or, they may be in separate .crt, .cer, and .key files.
* P7B/PKCS#7 (.p7b, .pjc)  Base64 encoded, and will only contain certificates and chain certificates.
* DER - binary form og PEM
* PFX/P12/PKCS#12 (.p12, .pkcs12, .pfx) - Binary format for storing server certificate, intermediate cert and private key.

### Spring MTLS support



### DIY CA and Certificate generation with OpenSSL
https://www.golinuxcloud.com/mutual-tls-authentication-mtls/


## RHEL

### Desktop Menu


[How to add applications](https://unix.stackexchange.com/questions/103213/how-can-i-add-an-application-to-the-gnome-application-menu) (untested)

[Desktop Spec](https://www.freedesktop.org/wiki/Specifications/desktop-entry-spec/) from freedesktop.org



