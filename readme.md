# 📦 spring-boot-clean-response-starter

A Spring Boot starter that automatically wraps API responses in a clean, consistent structure with built-in global exception handling.

Published to Maven Central.

---

## 🚀 Installation

Add this dependency to your project:

```xml
<dependency>
    <groupId>io.github.ak2484</groupId>
    <artifactId>spring-boot-clean-response-starter</artifactId>
    <version>1.0.0</version>
</dependency>
```

---

## ✨ Features

- ✅ Standardized API response format
- ✅ Global exception handling
- ✅ Auto-configuration support
- ✅ Works with Spring Boot 3+
- ✅ Java 17 compatible
- ✅ Zero configuration required

---

## 📋 Requirements

- Java 17+
- Spring Boot 3+
- Maven 3.8+

---

# 🛠 Publishing to Maven Central (Reference Guide)

This section is for future releases.

Publishing is done via Sonatype Central Portal.

---

## 1️⃣ Prerequisites

### ✔ Create Account

Create account at:
https://central.sonatype.com

Login using **GitHub OAuth** (recommended).

---

### ✔ Register Namespace

For GitHub-based projects:

```
io.github.<your-github-username>
```

Example:

```
io.github.ak2484
```

Namespace must be **Verified** before publishing.

---

### ✔ Generate User Token

In Central Portal:

Profile → Generate User Token

You will receive:

- Username
- Password (token)

---

### ✔ Generate GPG Key

Install GPG and run:

```bash
gpg --full-generate-key
```

List keys:

```bash
gpg --list-secret-keys --keyid-format LONG
```

Export public key:

```bash
gpg --armor --export YOUR_KEY_ID
```

Upload to a key server:

```bash
gpg --keyserver keyserver.ubuntu.com --send-keys YOUR_KEY_ID
```

---

## 2️⃣ Configure `settings.xml`

Location:

```
C:\Users\<your-username>\.m2\settings.xml
```

Template:

```xml
<settings>
  <servers>
    <server>
      <id>central</id>
      <username>YOUR_TOKEN_USERNAME</username>
      <password>YOUR_TOKEN_PASSWORD</password>
    </server>
  </servers>

  <profiles>
    <profile>
      <id>gpg</id>
      <properties>
        <gpg.keyname>YOUR_GPG_KEY_ID</gpg.keyname>
        <gpg.passphrase>YOUR_GPG_PASSPHRASE</gpg.passphrase>
      </properties>
    </profile>
  </profiles>

  <activeProfiles>
    <activeProfile>gpg</activeProfile>
  </activeProfiles>
</settings>
```

---

## 3️⃣ Required POM Configuration

### Distribution Management

```xml
<distributionManagement>
    <repository>
        <id>central</id>
        <name>Maven Central</name>
        <url>https://central.sonatype.com/api/v1/publisher/deployments</url>
    </repository>
</distributionManagement>
```

---

### Required Plugins

#### Central Publishing Plugin

```xml
<plugin>
    <groupId>org.sonatype.central</groupId>
    <artifactId>central-publishing-maven-plugin</artifactId>
    <version>0.4.0</version>
    <extensions>true</extensions>
    <configuration>
        <publishingServerId>central</publishingServerId>
        <tokenAuth>true</tokenAuth>
    </configuration>
</plugin>
```

#### Source Plugin

```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-source-plugin</artifactId>
</plugin>
```

#### Javadoc Plugin

```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-javadoc-plugin</artifactId>
</plugin>
```

#### GPG Plugin

```xml
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-gpg-plugin</artifactId>
</plugin>
```

---

## 4️⃣ Deploy

Run:

```bash
mvn clean deploy
```

If successful, you will see:

```
Deployment <id> has been validated
```

---

## 5️⃣ Manual Publish (Important)

Go to:

https://central.sonatype.com/publishing/deployments

Click your deployment → Click **Publish**

After 5–20 minutes, artifact appears on Maven Central.

---

# 🔄 Releasing New Version

1. Update version in `pom.xml`
2. Commit changes
3. Run:

```bash
mvn clean deploy
```

4. Publish in Central Portal

---

# 📜 License

Licensed under the Apache License 2.0.

---

# 👨‍💻 Author

**Akash**  
GitHub: https://github.com/ak2484

---

# ✅ Publishing Checklist

- [ ] Namespace Verified
- [ ] GPG Key Uploaded
- [ ] settings.xml Configured
- [ ] Sources & Javadoc Attached
- [ ] `mvn clean deploy`
- [ ] Manual Publish Clicked

---

⭐ If this project helps you, consider giving it a star on GitHub!
