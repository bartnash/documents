
Notes from courses taken while working on the [Red Hat AI Foundations: Technolgist Certificate](https://training-lms.redhat.com/sso/saml/auth/rhlpint?RelayState=deeplinklp%3D74939148) from the [Red Hat Learning Portal](https://training-lms.redhat.com/sso/saml/auth/rhlpint).


# AI Fundamentals

## What is AI
Artificial intelligence is ...
 - a branch of computer science that enables machines to perform tasks that typically require human intelligence.
 - a multidisciplinary branch of computer scient that simulates human intelligence processes in machines.
   - Learning
   - Reasoning
   - Self-Correction

## What is machine learning:
Machine learning (ML) is
 - a subcategory of AI that uses algorithms to identify patterns and make predictions within a set of data.

## Predictive AI

Predictive AI is a common type of artificial intelligence system used in business applications that predicts or forecasts outcomes based on historical data.

Logistic companies use predictive AI to optimize delivery routes and prevent package thefts.  Financial institutions use it to identify fraud, money laundering and other financial crimes.


Everyday examples:
 - Text autocompletion
 - Online retailer recommendations
 - Move and music recommendations

 ### Data Science
 Data science is an interdisciplinary field that leverages mathematical, statistical, and computational techniques to extract knowledge and insights from structured and unstructured data.

 #### Data Science Tools
 - Jupyter Notebooks
 - Pytorch
 - TensorFlow

## Generative AI
Generative AI relies on deep learning models trained on large data sets to create new content.

Deep Learning Model - Specialized form of machine learning that teaches computers to process data using algorithms inspired by the human brain.  Deep learning models use neural networks to train models.

### Everyday examples
- Amazon review summaries - AI-generated summaries of product reviews.
- Chatbots, like ChatGPT, simulate conversation with human users.  Uses understanding of language to respond with generated content.
- Red Hat's KCS Solution Summaries


### Large Language Model (LLM)
An LLM is a type of AI program designed to understand and generate human language.  LLMs can answer questions, generate text, translate languages...
LLMs make chatbots possible.

#### Foundation Models
Most organizations will not build their own LLM, but will start by using one of several foundation models.

Foundation Models can be mode more useful through:
- Prompt tuning - optimize the prompt to produce "good enough" results with less resources.  Fine tuning the prompt is less expensive that fine tuning the model.
- Retrieval augmented generation (RAG) - train models with targeted information without modifying the underlying model itself. Links an external resource, typically a vector database, to be used a reference material to deliver more accurate answers.
- Fine tuning foundation models - train model further on a specific dataset for a specific task.
- Model inferencing - the phase in which the trained AI/ML model is put to use to make predictions, generate text, classify data, etc.

### LLM issues
- Massive energy and resource costs.  The energy required to train GPT-2 was equivalent to that used by an average American household over 120 years.
- Transparency of training data.  Users have no way of knowing the accuracy of the training data.
- Bias
- Hallucinations
- Data recency - LLMs aren't continuously updated.  There is an effective "cutoff" date to an LLMs knowledge.
- Copyright and privacy.  



## Appendix
Russell and Norvig publish Artificial Intelligence: A Modern Approach
 - Most commonly used AI textbook.  Most recent version, 2020.

Important LLMs
- OpenAIs GPT-3 released in 2020, used by ChatGPT
- GPT-4 released by OpenAI in 2023
- Google's Gemini, released in 2023 as a successor to LaMDA and PaLM 2.
- Gemini 1.5

Additional resources
- [Demistifying AI](https://drive.google.com/file/d/16r-c2i6rBsRzAn27FSATymr6dukrz4IM/view?usp=sharing)
- [How to train an LLM using InstructLab(opens in a new tab](https://youtu.be/snMUJGXozec?feature=shared)
- [Shaw Talebi's YouTube AI playlist](https://youtube.com/playlist?list=PLz-ep5RbHosU2hnz5ejezwaYpdMutMVB0&feature=shared)





