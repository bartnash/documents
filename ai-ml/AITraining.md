
# Artificial Intelligence

The simulation of human intelligence in machines that are programmed to think and learn like humans


## Terms and Definitions

### Machine Learning
A subfield of AI that focuses on developing algorithms that can learn from and make predictions or decisions based on data

A subfield of AI that involves the development of algorithms and statistical models that enable machines to improve their performance with experience. Example: A machine learning algorithm that can predict which customers are most likely to churn based on their past behavior.

### Large Language Model (LLM)
A type of deep learning model trained on a large dataset to perform natural language understanding and generation tasks. 
There are many famous LLMs like BERT, PaLM, GPT-2, GPT-3, GPT-3.5, and the groundbreaking GPT-4. All of these models vary in 
size (number of parameters that can be tuned), in the breadth of tasks (coding, chat, scientific, etc.), and in what they're 
trained on.

### Fine-tuning
Fine-tuning in the context of Large Language Models (LLMs) is a process of adapting a pre-trained, general-purpose model to perform specific tasks or cater to particular applications. It involves training the model on a narrower dataset related to the desired task, allowing it to specialize and improve performance. Fine-tuning customizes the LLM's capabilities for tasks like sentiment analysis, question answering, or chatbots. This process involves adjusting hyperparameters, data preprocessing, and possibly modifying the model architecture. Fine-tuning enables LLMs to be more effective and efficient in specific domains, extending their utility across various applications while preserving their initial language understanding capabilities.

### RAG
RAG, or Retrieval-Augmented Generation, is a framework in natural language processing. It combines two key components: retrieval and generation. Retrieval involves selecting relevant information from a vast knowledge base, like the internet, and generation pertains to creating human-like text. RAG models employ a retriever to fetch context and facts related to a specific query or topic and a generator, often a language model, to produce coherent responses. This approach enhances the quality and relevance of generated text, making it useful for tasks like question answering, content summarization, and information synthesis, offering a versatile solution for leveraging external knowledge in AI-powered language understanding and production.


### Deep Learning

### Predictive AI

Predictive AI uses patterns in current data to predict future outcomes.  Nearest neighbor is one algorithm used here.

### Artificial General Intelligence (AGI)
The ability for machines to understand, learn and apply general knowledge across a wide range of tasks and domains.  Typically 
includes the ability to learn from unlabeled, unstructured data.

Artificial General Intelligence (AGI) refers to an AI system that possesses a wide range of cognitive abilities, much like 
humans, enabling them to learn, reason, adapt to new situations, and devise creative solutions across various tasks and domains, 
rather than being limited to specific tasks as narrow AI systems are.

### Generative AI

Generative AI is a type of artificial intelligence that creates new content, such as images, text, or music, by learning 
patterns and characteristics from existing data.


## We have no moat
[We Have No Moat and Neither Does OpenAI](https://www.semianalysis.com/p/google-we-have-no-moat-and-neither) "Leaked" doc from someone at Google analyzing their view of the state of open source vs closed AI. Great starting point for really learning about generative AI.

## ChatBots

### ChatGPT
Is a chat interface to a "Generative Pre-trained Transformer." The term "Generative" refers to the model's ability to generate 
new content, "Pre-trained" indicates that the model is initially trained on a large corpus of text data, and "Transformer" refers 
to the transformer architecture, which is a key component of the model. The GPT models are designed to generate text by 
leveraging the knowledge learned during pre-training on vast amounts of text data.

It is based on a model generated with a data set from 2021, so some info will be out of date.


### CollosalChat
	[CollosalChat](https://chat.colossalai.org/)  Down, couldn't test.
	
### Bing
 Bing chat, only accessible through edge browser. Very limited.  Won't generate code.  Isn't conversational.  Did I install edge on RHEL for this? meh

### you.com
 [you.com](https://you.com)Pretty nice.  Seemed to do a better job than ChatGPT of telling me the basics of writing a loop in Python.  The info it gave me lead me to ask questions with naturally progressed deeper into the language.  Let's you fine tune what sources it get's info from.   It is like Bing chat in that it is an AI augmented search engine, but more useful results similar to ChatGPT.  It allows you to like or dislike information sources.  No history of chats, so save it if you get something useful.

### Bard
 [bard.google.com](https://bard.google.com/) Looks comparable to chatgpt, based on Pathways Language Model 2 (PaLM 2).  In addition to PaLM 2, Bard also uses Google Search to provide users with access to up-to-date information.  Also has IDE plugins?

### Claude
 [claude.ai](https://claude.ai/chats)
	
## AI Based Tools

### Github copilot
Generative AI plugin which works with VSCode, Intellij, neovim, etc.
Developed by OpenAI in collaboration with GitHub, powered by OpenAI Codex.  It is a code completion tool and generates code based on comments that you type or the code you have started typing.

It doesn't seem suitable for templating projects or generating more than a few lines of code or functions.


## MLOps

### Kubeflow
[Kubeflow](https://www.kubeflow.org/) is a CNCF-affiliated project dedicated to making deployments of machine learning workflows on Kubernetes simple, portable and scalable.


[The Kubeflow Blog](https://blog.kubeflow.org/)

## Tools For Implementing AI

### Hugging face
[Hugging face](https://huggingface.co/) is an open source "AI community" which houses AI models, datasets, etc. and provides ability to share, collaborate and use the models, running on Hugging Face's infrastructure.  It is an "open source Machine Learning movement."

### Programming AI

[PaLM2] (https://developers.generativeai.google/products/palm)
fast.ai

PyTorch vs Tensorflow
fastai library built on top of pytorch

### Large Language Model

### Small Language Model
Look into Phi 1.5 through Phi 2

### Models
#### Mistral
Mistral 7B, 7.3B parameter model which compares well to larger models.
https://huggingface.co/mistralai/Mixtral-8x7B-Instruct-v0.1/tree/main

From [Mistral AI](https://mistral.ai/)

### LlamaIndex
[LlamaIndex](https://docs.llamaindex.ai/en/stable/index.html) is a data framework for LLM-based applications to ingest, structure, and access private or domain-specific data. It’s available in Python (these docs) and Typescript.
Framework for building RAGs based models. Builds an index of your documents which are used to prompt a model.  The model could be hosted locally or on a host such as OpenAI or HuggingFace.
 - Make your own chatbot [Chat LlamaIndex](https://chat.llamaindex.ai/) They have a couple already set up, including a Red Hat Linux Expert.
 - RAGs is a Streamlit app that lets you create a RAG pipeline from a data source using natural language.  https://github.com/run-llama/rags



### fastai book
[Fast.ai](https://www.fast.ai/) has a wealth of info about deep learning, including:
 - The [Fastai course](https://course.fast.ai/), also available on [github](https://github.com/fastai/fastbook/tree/master)
   I've started working through it: [Kaggle notebooks](https://www.kaggle.com/docs/notebooks)

### Openshift AI
[Red Hat® OpenShift® AI](https://access.redhat.com/documentation/en-us/red_hat_openshift_ai_cloud_service/1) is a flexible, scalable MLOps platform with tools to build, deploy, and manage AI-enabled applications. 
Built using open source technologies, it provides trusted, operationally consistent capabilities for teams to experiment, serve 
models, and deliver innovative apps.

OpenShift AI (previously called Red Hat OpenShift Data Science) supports the full lifecycle of AI/ML experiments and models, 
on-premise and in the public cloud.

Based on [Open Data Hub](https://opendatahub.io/), a blueprint for building an AI-as-a-Service (AIaaS) platform on Red Hat OpenShift. It inherits from upstream efforts such as Jupyter and Kubeflow, and is the foundation for Red Hat’s internal data science and AI platform.

[Architecture](https://redhatquickcourses.github.io/rhods-intro/rhods-intro/1.33/chapter1/section2.html)
A simplified view of some of the major components:
 - Workbenches: containerized, cloud-native data science working environment that runs on OpenShift. Workbenches run as OpenShift pods and contain commonly used data science tools such as JupyterLab, libraries such as Tensorflow, or ready-to-use GPU capabilities. RHOAI provides several preconfigured container images for creating workbenches.
 - Data Science Pipelines: A workflow that executes scripts or Jupyter notebooks in an automated fashion. Pipelines are useful to standardize the data gathering - data cleaning - model training - model evaluation - model upload cycle. Typically, a pipeline ends after the trained model has been uploaded to an S3 bucket or similar cloud storage.
 - Model Servers: A model server can read an exported model file and serve the model in a standard API. Model servers require a data connection to download the model files from the cloud storage.

 Howto:
  - 






