from os.path import dirname, join

from setuptools import find_packages, setup


with open(join(dirname(__file__), 'VERSION'), 'rb') as f:
    version = f.read().decode('ascii').strip()


setup(
    name='leon-lee',
    version=version,
    url='https://github.com/AppliedAlgorithmsGroup/leon-lee',
    description='Applied Algorithms Practices.',
    author='Leon Lee',
    author_email='leon.lee@berkeley.edu',
    maintainer='Leon Lee',
    maintainer_email='leon.lee@berkeley.edu',
    license='MIT',
    packages=find_packages(exclude=('tests')),
    include_package_data=True,
    zip_safe=False,
    classifiers=[
        'Framework :: leon-lee',
        'Development Status :: 4 - Beta',
        'Environment :: Console',
        'Intended Audience :: Developers',
        'License :: OSI Approved :: MIT',
        'Operating System :: OS Independent',
        'Programming Language :: Python :: 3.6',
        'Topic :: Internet :: WWW/HTTP',
        'Topic :: Software Engineering :: Hackerrank',
    ],
    install_requires=[],
)